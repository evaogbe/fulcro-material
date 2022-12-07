(ns ogbe.fulcro.mui.icons.weekend
  #?(:cljs (:require
            ["@mui/icons-material/Weekend" :default Weekend]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-weekend
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Weekend)))