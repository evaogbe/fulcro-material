(ns ogbe.fulcro.mui.icons.add-box
  #?(:cljs (:require
            ["@mui/icons-material/AddBox" :default AddBox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-box
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddBox)))