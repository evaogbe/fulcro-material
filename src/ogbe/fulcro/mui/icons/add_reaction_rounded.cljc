(ns ogbe.fulcro.mui.icons.add-reaction-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AddReactionRounded" :default AddReactionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-reaction-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddReactionRounded)))