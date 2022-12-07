(ns ogbe.fulcro.mui.icons.stadium
  #?(:cljs (:require
            ["@mui/icons-material/Stadium" :default Stadium]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stadium
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stadium)))