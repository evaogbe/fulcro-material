(ns ogbe.fulcro.mui.icons.cached-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CachedSharp" :default CachedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cached-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CachedSharp)))