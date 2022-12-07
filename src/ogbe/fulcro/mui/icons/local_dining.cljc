(ns ogbe.fulcro.mui.icons.local-dining
  #?(:cljs (:require
            ["@mui/icons-material/LocalDining" :default LocalDining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-dining
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalDining)))