(ns ogbe.fulcro.mui.icons.phonelink
  #?(:cljs (:require
            ["@mui/icons-material/Phonelink" :default Phonelink]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phonelink
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Phonelink)))