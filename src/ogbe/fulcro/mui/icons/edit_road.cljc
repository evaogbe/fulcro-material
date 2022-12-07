(ns ogbe.fulcro.mui.icons.edit-road
  #?(:cljs (:require
            ["@mui/icons-material/EditRoad" :default EditRoad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-road
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditRoad)))