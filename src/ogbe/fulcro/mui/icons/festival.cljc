(ns ogbe.fulcro.mui.icons.festival
  #?(:cljs (:require
            ["@mui/icons-material/Festival" :default Festival]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-festival
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Festival)))