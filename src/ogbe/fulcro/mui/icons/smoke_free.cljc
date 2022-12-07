(ns ogbe.fulcro.mui.icons.smoke-free
  #?(:cljs (:require
            ["@mui/icons-material/SmokeFree" :default SmokeFree]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smoke-free
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmokeFree)))