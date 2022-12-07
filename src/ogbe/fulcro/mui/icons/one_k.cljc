(ns ogbe.fulcro.mui.icons.one-k
  #?(:cljs (:require
            ["@mui/icons-material/OneK" :default OneK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-one-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OneK)))