(ns ogbe.fulcro.mui.icons.expand
  #?(:cljs (:require
            ["@mui/icons-material/Expand" :default Expand]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Expand)))