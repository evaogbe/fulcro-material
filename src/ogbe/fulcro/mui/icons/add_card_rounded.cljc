(ns ogbe.fulcro.mui.icons.add-card-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AddCardRounded" :default AddCardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-card-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddCardRounded)))