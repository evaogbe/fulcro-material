(ns ogbe.fulcro.mui.icons.add-comment
  #?(:cljs (:require
            ["@mui/icons-material/AddComment" :default AddComment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-comment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddComment)))