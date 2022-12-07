(ns ogbe.fulcro.mui.icons.social-distance
  #?(:cljs (:require
            ["@mui/icons-material/SocialDistance" :default SocialDistance]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-social-distance
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SocialDistance)))