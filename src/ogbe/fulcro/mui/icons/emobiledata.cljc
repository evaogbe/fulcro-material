(ns ogbe.fulcro.mui.icons.emobiledata
  #?(:cljs (:require
            ["@mui/icons-material/EMobiledata" :default EMobiledata]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emobiledata
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EMobiledata)))