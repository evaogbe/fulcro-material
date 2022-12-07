(ns ogbe.fulcro.mui.icons.share-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ShareTwoTone" :default ShareTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareTwoTone)))