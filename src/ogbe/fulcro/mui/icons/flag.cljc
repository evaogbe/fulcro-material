(ns ogbe.fulcro.mui.icons.flag
  #?(:cljs (:require
            ["@mui/icons-material/Flag" :default Flag]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flag)))