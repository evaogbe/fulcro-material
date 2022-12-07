(ns ogbe.fulcro.mui.icons.chevron-right
  #?(:cljs (:require
            ["@mui/icons-material/ChevronRight" :default ChevronRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chevron-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChevronRight)))