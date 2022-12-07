(ns ogbe.fulcro.mui.icons.add-link
  #?(:cljs (:require
            ["@mui/icons-material/AddLink" :default AddLink]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-link
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddLink)))