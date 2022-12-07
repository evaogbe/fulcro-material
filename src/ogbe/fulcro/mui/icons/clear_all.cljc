(ns ogbe.fulcro.mui.icons.clear-all
  #?(:cljs (:require
            ["@mui/icons-material/ClearAll" :default ClearAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearAll)))