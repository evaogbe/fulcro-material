(ns ogbe.fulcro.mui.icons.addchart
  #?(:cljs (:require
            ["@mui/icons-material/Addchart" :default Addchart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-addchart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Addchart)))