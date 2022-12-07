(ns ogbe.fulcro.mui.icons.light-mode
  #?(:cljs (:require
            ["@mui/icons-material/LightMode" :default LightMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-light-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightMode)))