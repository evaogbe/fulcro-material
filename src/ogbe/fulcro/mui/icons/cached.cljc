(ns ogbe.fulcro.mui.icons.cached
  #?(:cljs (:require
            ["@mui/icons-material/Cached" :default Cached]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cached
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cached)))