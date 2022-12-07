(ns ogbe.fulcro.mui.icons.battery30
  #?(:cljs (:require
            ["@mui/icons-material/Battery30" :default Battery30]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery30
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery30)))