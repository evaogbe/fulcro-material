(ns ogbe.fulcro.mui.icons.public-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PublicRounded" :default PublicRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-public-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublicRounded)))