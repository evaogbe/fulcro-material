(ns ogbe.fulcro.mui.icons.speed
  #?(:cljs (:require
            ["@mui/icons-material/Speed" :default Speed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Speed)))