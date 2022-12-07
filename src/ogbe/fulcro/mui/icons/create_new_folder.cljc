(ns ogbe.fulcro.mui.icons.create-new-folder
  #?(:cljs (:require
            ["@mui/icons-material/CreateNewFolder" :default CreateNewFolder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create-new-folder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreateNewFolder)))