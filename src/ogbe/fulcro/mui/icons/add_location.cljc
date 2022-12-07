(ns ogbe.fulcro.mui.icons.add-location
  #?(:cljs (:require
            ["@mui/icons-material/AddLocation" :default AddLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddLocation)))