(ns ogbe.fulcro.mui.icons.stop
  #?(:cljs (:require
            ["@mui/icons-material/Stop" :default Stop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stop)))