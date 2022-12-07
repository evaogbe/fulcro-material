(ns ogbe.fulcro.mui.icons.add-to-drive
  #?(:cljs (:require
            ["@mui/icons-material/AddToDrive" :default AddToDrive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-to-drive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddToDrive)))