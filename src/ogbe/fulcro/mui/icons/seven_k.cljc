(ns ogbe.fulcro.mui.icons.seven-k
  #?(:cljs (:require
            ["@mui/icons-material/SevenK" :default SevenK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-seven-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SevenK)))