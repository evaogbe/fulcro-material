(ns ogbe.fulcro.mui.icons.chevron-left
  #?(:cljs (:require
            ["@mui/icons-material/ChevronLeft" :default ChevronLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chevron-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChevronLeft)))