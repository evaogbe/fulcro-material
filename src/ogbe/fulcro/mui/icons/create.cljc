(ns ogbe.fulcro.mui.icons.create
  #?(:cljs (:require
            ["@mui/icons-material/Create" :default Create]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Create)))