(ns ogbe.fulcro.mui.icons.add-card
  #?(:cljs (:require
            ["@mui/icons-material/AddCard" :default AddCard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-card
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddCard)))