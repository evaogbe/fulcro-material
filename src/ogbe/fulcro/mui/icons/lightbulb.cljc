(ns ogbe.fulcro.mui.icons.lightbulb
  #?(:cljs (:require
            ["@mui/icons-material/Lightbulb" :default Lightbulb]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Lightbulb)))