(ns ogbe.fulcro.mui.icons.storage
  #?(:cljs (:require
            ["@mui/icons-material/Storage" :default Storage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Storage)))