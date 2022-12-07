(ns ogbe.fulcro.mui.icons.add-road
  #?(:cljs (:require
            ["@mui/icons-material/AddRoad" :default AddRoad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-road
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddRoad)))