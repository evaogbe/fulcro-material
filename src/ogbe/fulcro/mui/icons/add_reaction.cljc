(ns ogbe.fulcro.mui.icons.add-reaction
  #?(:cljs (:require
            ["@mui/icons-material/AddReaction" :default AddReaction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-reaction
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddReaction)))