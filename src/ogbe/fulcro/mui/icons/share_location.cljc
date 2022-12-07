(ns ogbe.fulcro.mui.icons.share-location
  #?(:cljs (:require
            ["@mui/icons-material/ShareLocation" :default ShareLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareLocation)))