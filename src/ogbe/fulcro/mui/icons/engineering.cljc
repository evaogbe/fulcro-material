(ns ogbe.fulcro.mui.icons.engineering
  #?(:cljs (:require
            ["@mui/icons-material/Engineering" :default Engineering]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-engineering
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Engineering)))