(ns ogbe.fulcro.mui.icons.cached-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CachedTwoTone" :default CachedTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cached-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CachedTwoTone)))