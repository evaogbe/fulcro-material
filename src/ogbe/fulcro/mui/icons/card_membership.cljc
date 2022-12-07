(ns ogbe.fulcro.mui.icons.card-membership
  #?(:cljs (:require
            ["@mui/icons-material/CardMembership" :default CardMembership]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-card-membership
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CardMembership)))