(ns ogbe.fulcro.mui.icons.publish-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PublishRounded" :default PublishRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-publish-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublishRounded)))