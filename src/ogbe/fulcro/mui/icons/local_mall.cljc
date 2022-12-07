(ns ogbe.fulcro.mui.icons.local-mall
  #?(:cljs (:require
            ["@mui/icons-material/LocalMall" :default LocalMall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-mall
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalMall)))