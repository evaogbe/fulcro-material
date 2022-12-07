(ns ogbe.fulcro.mui.icons.cached-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CachedRounded" :default CachedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cached-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CachedRounded)))