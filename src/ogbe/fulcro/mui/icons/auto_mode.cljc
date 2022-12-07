(ns ogbe.fulcro.mui.icons.auto-mode
  #?(:cljs (:require
            ["@mui/icons-material/AutoMode" :default AutoMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoMode)))