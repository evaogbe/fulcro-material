(ns ogbe.fulcro.mui.icons.battery80
  #?(:cljs (:require
            ["@mui/icons-material/Battery80" :default Battery80]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery80
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery80)))