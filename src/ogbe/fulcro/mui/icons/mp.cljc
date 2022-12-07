(ns ogbe.fulcro.mui.icons.mp
  #?(:cljs (:require
            ["@mui/icons-material/Mp" :default Mp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mp)))