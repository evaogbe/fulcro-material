(ns ogbe.fulcro.mui.icons.battery20
  #?(:cljs (:require
            ["@mui/icons-material/Battery20" :default Battery20]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery20
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery20)))