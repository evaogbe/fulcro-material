(ns ogbe.fulcro.mui.icons.blinds-closed
  #?(:cljs (:require
            ["@mui/icons-material/BlindsClosed" :default BlindsClosed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blinds-closed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindsClosed)))