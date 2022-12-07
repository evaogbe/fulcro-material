(ns ogbe.fulcro.mui.icons.sick
  #?(:cljs (:require
            ["@mui/icons-material/Sick" :default Sick]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sick
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sick)))