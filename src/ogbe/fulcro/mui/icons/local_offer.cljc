(ns ogbe.fulcro.mui.icons.local-offer
  #?(:cljs (:require
            ["@mui/icons-material/LocalOffer" :default LocalOffer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-offer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalOffer)))