(ns ogbe.fulcro.mui.icons.square-foot-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SquareFootRounded" :default SquareFootRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square-foot-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SquareFootRounded)))