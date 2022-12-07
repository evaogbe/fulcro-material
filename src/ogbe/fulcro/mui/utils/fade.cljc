(ns ogbe.fulcro.mui.utils.fade
  #?(:cljs (:require
            ["@mui/material/Fade" :default Fade]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-fade #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Fade)))
